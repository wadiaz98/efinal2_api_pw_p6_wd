package com.example.demo.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IVehiculoService;
import com.example.demo.service.dto.VehiculoDTO;
import com.example.demo.service.to.VehiculoTO;

@RestController
@RequestMapping(path = "/vehiculos")
@CrossOrigin
public class VehiculoControllerRestFul {

	@Autowired
	private IVehiculoService service;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VehiculoTO> guardar(@RequestBody VehiculoTO to) {
		this.service.guardar(to);
		return new ResponseEntity<>(to, HttpStatus.OK);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<VehiculoDTO>> todos() {
		List<VehiculoDTO> list = this.service.consultarTodos();
		for (VehiculoDTO dto : list) {
			Link link = linkTo(methodOn(VehiculoControllerRestFul.class).consultarPlaca(dto.getPlaca())).withSelfRel();
			dto.add(link);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping(path = "/{placa}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VehiculoTO> consultarPlaca(@PathVariable String placa) {
		return new ResponseEntity<>(this.service.consultarPlaca(placa), HttpStatus.OK);
	}

	@DeleteMapping(path = "/{placa}", produces = MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> eliminar(@PathVariable String placa) {
		this.service.eliminar(placa);
		return new ResponseEntity<>("Se elimino correctamente", HttpStatus.OK);
	}
}
