package com.board.demo.service;

import com.board.demo.mapper.PostMapper;
import com.board.demo.model.SearchDTO;
import com.board.demo.model.request.PostRequest;
import com.board.demo.model.response.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {


    private final PostMapper postMapper;

    @Transactional
    public Long savePost(final PostRequest post){
        postMapper.insertPost(post);
        return post.getId();
    }

    public PostResponse findPostById(final Long id){
        return postMapper.findById(id);
    }

    @Transactional
    public Long updatePost(final PostRequest post){
        postMapper.updatePost(post);
        return post.getId();
    }

    public Long deletePost(final Long id){
        postMapper.deleteById(id);
        return id;
    }

    public List<PostResponse> findAllPost(final SearchDTO page){
        return postMapper.findAllPost(page);
    }

}