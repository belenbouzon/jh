package com.belen.colorima.service;

import java.util.Optional;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import com.belen.colorima.domain.User;
import com.belen.colorima.web.rest.dto.ManagedUserDTO;

public interface UserServiceInterface {

	Optional<User> activateRegistration(String key);

	Optional<User> completePasswordReset(String newPassword, String key);

	Optional<User> requestPasswordReset(String mail);

	User createUserInformation(String login, String password, String firstName, String lastName, String email,
			String langKey);

	User createUser(ManagedUserDTO managedUserDTO);

	void updateUserInformation(String firstName, String lastName, String email, String langKey);

	void deleteUserInformation(String login);

	void changePassword(String password);

	Optional<User> getUserWithAuthoritiesByLogin(String login);

	User getUserWithAuthorities(Long id);

	User getUserWithAuthorities();

	/**
	 * Persistent Token are used for providing automatic authentication, they should be automatically deleted after
	 * 30 days.
	 * <p>
	 * This is scheduled to get fired everyday, at midnight.
	 * </p>
	 */
	void removeOldPersistentTokens();

	/**
	 * Not activated users should be automatically deleted after 3 days.
	 * <p>
	 * This is scheduled to get fired everyday, at 01:00 (am).
	 * </p>
	 */
	void removeNotActivatedUsers();

}