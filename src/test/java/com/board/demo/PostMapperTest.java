//package com.board.demo;
//
//import com.board.demo.mapper.PostMapper;
//import com.board.demo.model.request.PostRequest;
//import com.board.demo.model.response.PostResponse;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class PostMapperTest
//{
//    @Autowired
//    PostMapper postMapper;
//
//
//    @Test
//    void insertPost(){
//        PostRequest post = new PostRequest();
//        post.setTitle("게시글 테스트");
//        post.setContent("안녕하세요");
//        post.setWriter("어드민");
//        post.setNoticeYn(false);
//        postMapper.insertPost(post);
//
//        List<PostResponse> posts = postMapper.findAllPost();
//        System.out.println("게시글: "+ ((List<?>) posts).size());
//    }
//
//    @Test
//    void findById(){
//        PostResponse post = postMapper.findById(2L);
//        try{
//            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(post);
//            System.out.println("json: "+postJson);
//        } catch (Exception e){
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void updatePost(){
//        PostRequest param = new PostRequest();
//        param.setId(2L);
//        param.setTitle("update 테스트");
//        param.setContent("게시글 내용을 수정했습니다.");
//        param.setNoticeYn(false);
//        param.setWriter("유저1");
//        postMapper.updatePost(param);
//    }
//
//    @Test
//    void deletePost(){
//        System.out.println("삭제전 게시글 개수: " + postMapper.postCount());
//        postMapper.deleteById(2L);
//        System.out.println("삭제이후 게시글 개수: " + postMapper.postCount());
//    }
//
//
//}
