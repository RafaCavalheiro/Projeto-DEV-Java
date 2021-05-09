package com.projeto.sistema_artigos.Controller;

import com.projeto.sistema_artigos.Model.Usuario;				// Utilizado na linha 25

import org.springframework.web.bind.annotation.GetMapping;		// Utilizado na linha 21
import org.springframework.web.bind.annotation.RequestParam;	// Utilizado na linha 22 e 23
import org.springframework.web.bind.annotation.ResponseBody;	// Utilizado na linha 22
import org.springframework.web.bind.annotation.RequestMapping;	// Utilizado na linha 14
import org.springframework.web.bind.annotation.RestController;	// Utilizado na linha 13
import org.springframework.web.servlet.view.RedirectView;		// Utilizado na linha 22
import org.springframework.beans.factory.annotation.Autowired; 	// Utilizado na linha 17

@RestController								// Anotação para Controller de API Rest
@RequestMapping(path="/usuario") 			// Isso significa que os URLs começam com /usuario (após o caminho do aplicativo)
public class UsuarioController {

	@Autowired 								// Notação para obter o bean chamado usuarioRepository
         									// Que é gerado automaticamente pelo Spring, vamos usá-lo para lidar com os dados
  	private UsuarioRepository usuarioRepository;

	@GetMapping(path="/add")				// Anotação para get e rota do método
	public @ResponseBody RedirectView addNewUsuario(@RequestParam(value = "nomeusuario", defaultValue = "Nome usuário não informado") String nomeusuario, 	//RequestParam recebe por URL a informação de nomeusuario e valida se não está vazia
						 					  @RequestParam(value = "tipousuario", defaultValue = "Tipo usuário não informado") String tipousuario) { 	//RequestParam recebe por URL a informação de tipousuario e valida se não está vazia
							 
		Usuario dados = new Usuario(); 		// Inicia um novo objeto de Usuarios
		dados.setNomeusuario(nomeusuario); 	// Atribui a variavel nomeusuario ao Nome Usuario
		dados.setTipousuario(tipousuario); 	// Atribui a variavel tipousuario ao Tipo Usuario
		usuarioRepository.save(dados); 		// Salva dados no objeto de Usuarios no reposítorio de Usuarios

        return new RedirectView("../"); 	// Retorna para index
	}

	@GetMapping(path="/cientista")			// Anotação para get e rota do método
	public @ResponseBody Iterable<Usuario> getAllCientista() {
		return usuarioRepository.findAll();	// Retorna um JSON com todos os usuarios
	}

	@GetMapping(path="/pesquisador")		// Anotação para get e rota do método
	public @ResponseBody Iterable<Usuario> getAllPesquisador() {
		return usuarioRepository.findAll();	// Retorna um JSON com todos os usuarios
	}	
	
}