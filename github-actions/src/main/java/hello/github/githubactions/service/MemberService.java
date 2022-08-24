package hello.github.githubactions.service;

import hello.github.githubactions.controller.dto.MemberRequestDto;
import hello.github.githubactions.domain.Member;
import hello.github.githubactions.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MemberService {
	private final MemberRepository memberRepository;

	public List<Member> findMembers() {
		return memberRepository.findAll();
	}

	public Member findMember(String username) {
		return memberRepository.findByUsername(username).orElse(null);
	}

	@Transactional
	public Long join(MemberRequestDto memberRequestDto) {
		Member member = memberRequestDto.toEntity();
		memberRepository.save(member);

		return member.getId();
	}
}
