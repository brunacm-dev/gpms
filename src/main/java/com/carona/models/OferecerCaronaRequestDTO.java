

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class OferecerCaronaRequestDTO {
    private String usuarioId;
    private String papel; // motorista ou passageiro
    private String status; // passada ou atual

}
