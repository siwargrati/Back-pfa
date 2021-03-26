package org.sid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.sid.domain.Response;
import org.sid.entities.Fichiers;

import java.io.IOException;
//import java.util.List;


import org.sid.dao.*;
//import org.sid.entities.Fichiers;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/*")
public class FichiersRestService {
	//pour faire l'injection des dépendances 
	@Autowired
	private   FichiersRepository  fichierRepository;
	@PostMapping(value="/saveFile")
	public ResponseEntity<Response>saveFile(@RequestParam("file") MultipartFile file)throws JsonParseException, JsonMappingException,IOException{
		Fichiers fichier = null ;
		fichier.setFichierNom(file.getOriginalFilename());
		fichier.setFichier(file.getBytes());
		//Fichiers dbFichier = FichiersRestService.save(fichier);
		return new ResponseEntity<Response>(new Response(""), HttpStatus.OK);
	}
	
	/*@GetMapping("Fichiers")
public List<Fichiers> getFichiers(){
		return this.fichierRepository.findAll();
	}*/
}

