package com.board.demo.mapper;

import com.board.demo.model.request.PostRequest;
import com.board.demo.model.response.PostResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    void insertPost(PostRequest post);

    PostResponse findById(Long id);

    void updatePost(PostRequest post);

    void deleteById(Long id);
    
    List<PostResponse> findAllPost();

    int postCount();
}
