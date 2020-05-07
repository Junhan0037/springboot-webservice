package me.whiteship.springboot.web;

import lombok.RequiredArgsConstructor;
import me.whiteship.springboot.service.PostsService;
import me.whiteship.springboot.web.dto.PostsResponseDto;
import me.whiteship.springboot.web.dto.PostsSaveRequestDto;
import me.whiteship.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    // 게시물 등록
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto); // id값이 return된다
    }

    // 게시물 수정
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id,
                       @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    // 게시물 검색
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

}