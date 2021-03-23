package com.tecnicos.demo.resources;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tecnicos.demo.models.Tecnico;
import com.tecnicos.demo.repository.TecnicoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Tecnicos")
public class TecnicoResource {
	
	@Autowired
	TecnicoRepository tecnicoRepository;
	
	@ApiOperation(value="Retorna uma lista de tecnicos")
	@GetMapping("/tecnicos")
	public List<Tecnico> listaTecnicos(){
		return tecnicoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna uma unico tecnico")
	@GetMapping("/tecnicos/{id}")
	public Tecnico listaTecnicoUnico(@PathVariable(value="id") long id){
		return tecnicoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um tecnico")
	@PostMapping("/tecnicos")
	public Tecnico salvaTecnico(@RequestBody Tecnico tecnico) {
		return tecnicoRepository.save(tecnico);
	}
	
	@ApiOperation(value="Deleta um tecnico")
	@DeleteMapping("/tecnicos")
	public void deletaTecnico(@RequestBody Tecnico tecnico) {
		tecnicoRepository.delete(tecnico);
	}
	
	@ApiOperation(value="Atualiza um tecnico")
	@PutMapping("/tecnicos")
	public Tecnico atualizaTecnico(@RequestBody Tecnico tecnico) {
		return tecnicoRepository.save(tecnico);
	}
}
	 