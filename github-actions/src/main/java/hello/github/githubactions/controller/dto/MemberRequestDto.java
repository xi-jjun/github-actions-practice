package hello.github.githubactions.controller.dto;

import hello.github.githubactions.domain.Member;
import lombok.Data;

@Data
public class MemberRequestDto {
	private String username;
	private String nickname;
	private String password;

	public Member toEntity() {
		return Member.builder()
				.username(username)
				.nickname(nickname)
				.password(password)
				.build();
	}
}
