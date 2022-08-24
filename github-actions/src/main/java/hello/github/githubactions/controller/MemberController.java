package hello.github.githubactions.controller;

import hello.github.githubactions.controller.dto.MemberRequestDto;
import hello.github.githubactions.domain.Member;
import hello.github.githubactions.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
@RestController
public class MemberController {
	private final MemberService memberService;

	@GetMapping
	public List<Member> getMembers() {
		return memberService.findMembers();
	}

	@GetMapping("/{username}")
	public Member findMember(@PathVariable(name = "username") String username) {
		return memberService.findMember(username);
	}

	@PostMapping
	public Long saveMember(@RequestBody MemberRequestDto memberRequestDto) {
		log.info("member request data : {}", memberRequestDto.toString());
		return memberService.join(memberRequestDto);
	}
}
