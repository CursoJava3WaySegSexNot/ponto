package br.com.threeway.segsex.ponto.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class MensagemUtil {


    public static void mostreMensagem(String mensagem, FacesMessage.Severity severity) {
        FacesContext msg = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(mensagem, null);
        message.setSeverity(severity);
        msg.addMessage(null, message);
    }

    public static void mostreMensagem(String mensagem){
        mostreMensagem(mensagem, FacesMessage.SEVERITY_INFO);
    }
}
