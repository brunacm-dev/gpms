package com.carona.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carona.models.Usuario;
import com.carona.models.Viagem;
import com.carona.models.requests.OferecerCaronaRequestDTO;
import com.carona.models.requests.PedirCaronaRequestDTO;
import com.carona.models.requests.ListarCaronaRequestDTO;
import com.carona.repository.CaronaRepository;
import com.carona.repository.UsuarioRepository;

@Service
public class CaronaService {
    @Autowired
    private CaronaRepository caronaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void oferecerCarona(OferecerCaronaRequestDTO carona)
    {
        if((carona.getLocalPartida() == null || carona.getLocalDestino() == null) && carona.getIdPontoFixo() == null)
        {
            throw new RuntimeException("Local ou ponto fixo deve ser informado");
        }

        if (!usuarioRepository.emailExiste(carona.getEmail())) {
            throw new RuntimeException("Email não encontrado");
        }

        Usuario usuario = usuarioRepository.carregarUsuario(carona.getEmail());
        caronaRepository.oferecerCarona(usuario.getIdUsuario(), carona);
    }

    public List<Viagem> listarCarona(ListarCaronaRequestDTO carona){
        return caronaRepository.listarCarona(carona);
    }

    public void pedirCarona(PedirCaronaRequestDTO carona)
    {
        //return caronaRepository.pedirCarona(carona);
    }
}
