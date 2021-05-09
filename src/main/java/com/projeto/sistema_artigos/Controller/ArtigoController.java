package com.projeto.sistema_artigos.Controller;

import com.projeto.sistema_artigos.Model.Artigo;				// Utilizado na linha 25

import org.springframework.web.bind.annotation.GetMapping;		// Utilizado na linha 21
import org.springframework.web.bind.annotation.RequestParam;	// Utilizado na linha 22 e 23
import org.springframework.web.bind.annotation.ResponseBody;	// Utilizado na linha 22
import org.springframework.web.bind.annotation.RequestMapping;	// Utilizado na linha 14
import org.springframework.web.bind.annotation.RestController;	// Utilizado na linha 13

import org.springframework.beans.factory.annotation.Autowired;	// Utilizado na linha 17

@RestController								// Anotação para Controller de API Rest
@RequestMapping(path="/artigo") 			// Isso significa que os URLs começam com /artigo (após o caminho do aplicativo)
public class ArtigoController {

	@Autowired 								// Notação para obter o bean chamado usuarioRepository
											// Que é gerado automaticamente pelo Spring, vamos usá-lo para lidar com os dados
  	private ArtigoRepository artigoRepository;

	@GetMapping(path="/add")				// Anotação para get e rota do método
	public @ResponseBody String addNewArtigo(@RequestParam(value = "nomeartigo", defaultValue = "Nome artigo não informado") String nomeartigo, 				 //RequestParam recebe por URL a informação de nomeartigo e valida se não está vazia
						 					 @RequestParam(value = "descricaoartigo", defaultValue = "Descrição artigo não informado") String descricaoartigo) { //RequestParam recebe por URL a informação de descricaoartigo e valida se não está vazia
							 
		Artigo dados = new Artigo();		// Inicia um novo objeto de Artigos
		dados.setNomeartigo(nomeartigo);	// Atribui a variavel nomeartigo ao Nomeartigo
		dados.setDescricaoartigo(descricaoartigo); // Atribui a variavel descricaoartigo ao Descricaoartigo
		dados.setAssinatura(false);			// Atribui o valor false ao Assinatura
		artigoRepository.save(dados);		// Salva dados no objeto de Artigos no reposítorio de Artigo

		return "Artigo criado!";			// Mensagem de retorno
	}

	@GetMapping(path="/all")				// Anotação para get e rota do método	
	public @ResponseBody Iterable<Artigo> getAllArtigos() {
		return artigoRepository.findAll(); 	// Retorna um JSON com todos os usuarios
	}
}