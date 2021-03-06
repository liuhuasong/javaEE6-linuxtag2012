package com.acme.youTask.business;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

import com.acme.youTask.domain.User;

/**
 * @author <a href="mailto:marek.i@gmx.net">Marek Iwaszkiewicz</a>
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
@Local
public interface UserService extends Serializable {

    void saveUser(final User user);

    void mergeUser(final User user);

    void removeUser(final User user);

    boolean userExists(final Long userId);

    User loadById(final Long userId);

    User loadByUsername(final String username);

    List<User> loadAll();

}
