package com.carona.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carona.models.Usuario;
import com.carona.models.Veiculo;
import com.carona.models.requests.CriarUsuarioRequestDTO;
import com.carona.models.requests.VeiculoRequestDTO;
import com.carona.repository.UsuarioRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void criarUsuario(CriarUsuarioRequestDTO usuario) {
    	
    	log.debug("criarUsuario() INICIO : criando usuario usuario={}",usuario);
    	
        if (usuarioRepository.emailExiste(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado");
        }

        usuarioRepository.criarUsuario(usuario.getNome(), "0" ,usuario.getEmail(), usuario.getSenha());
    }

    public void criarVeiculo(VeiculoRequestDTO veiculo)
    {
        if (!usuarioRepository.emailExiste(veiculo.getEmail())) {
            throw new RuntimeException("Email não encontrado");
        }

        Usuario usuario = usuarioRepository.carregarUsuario(veiculo.getEmail());

        usuarioRepository.criarVeiculo(usuario.getIdUsuario(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getCor(), veiculo.getPlaca(), veiculo.getCnh());
    }

    public List<Veiculo> verVeiculos(String email){
        if (!usuarioRepository.emailExiste(email)) {
            throw new RuntimeException("Email não encontrado");
        }

        return usuarioRepository.verVeiculos(email);
    }

    public Usuario carregarUsuario(String email){
        if (!usuarioRepository.emailExiste(email)) {
            throw new RuntimeException("Email não encontrado");
        }

        return usuarioRepository.carregarUsuario(email);
    }
}
