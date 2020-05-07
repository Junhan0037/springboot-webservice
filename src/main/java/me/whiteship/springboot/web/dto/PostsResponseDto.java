package me.whiteship.springboot.web.dto;

import lombok.Getter;
import me.whiteship.springboot.domain.posts.Posts;

// 게시물 검색
@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
