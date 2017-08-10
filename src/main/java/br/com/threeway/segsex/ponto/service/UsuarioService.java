package br.com.threeway.segsex.ponto.service;

import br.com.threeway.segsex.ponto.dao.UsuarioDao;
import br.com.threeway.segsex.ponto.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Usuario loadUserByUsername(String username) throws UsernameNotFoundException {
		return usuarioDao.findByUsername(username);
	}

	public void save(Usuario usuario){
		if(usuario.getId() == null){
			changePassword(usuario);
		}
		usuarioDao.save(usuario);
	}

	public void changePassword(Usuario usuario) {
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
	}

}
