package hello.github.githubactions.repository;

import hello.github.githubactions.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findByNickname(String nickname);

	Optional<Member> findByUsername(String username);
}
