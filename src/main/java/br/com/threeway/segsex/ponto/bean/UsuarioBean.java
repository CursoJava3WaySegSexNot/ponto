package br.com.threeway.segsex.ponto.bean;

import br.com.threeway.segsex.ponto.domain.Usuario;
import br.com.threeway.segsex.ponto.service.UsuarioService;
import br.com.threeway.segsex.ponto.util.MensagemUtil;
import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@Component
@ViewScoped
public class UsuarioBean {

    @Autowired
    private UsuarioService usuarioService;

    private Usuario usuario;
    private Boolean skip;

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void save(){
        usuarioService.save(usuario);
        MensagemUtil.mostreMensagem(usuario.getNome()+" Salvo com sucesso");
        usuario = new Usuario();
    }


    public void delete(){
        usuarioService.delete(usuario);
        MensagemUtil.mostreMensagem(usuario.getNome()+" Salvo com sucesso");
    }

    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}
