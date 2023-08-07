package com.board.demo.controller;


import com.board.demo.model.request.PostRequest;
import com.board.demo.model.response.PostResponse;
import com.board.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/post/write.do")
    public String forwardPostWrite(@RequestParam(value = "id", required = false) final Long id, Model model){
        if(id!=null){
            PostResponse post = postService.findPostById(id);
            model.addAttribute("post",post);
        }
        return "post/write";
    }

    @PostMapping("/post/save.do")
    public String savePost(final PostRequest post){
        postService.savePost(post);
        return "redirect:/post/list.do";
    }

    @GetMapping("/post/list.do")
    public String showPostList(Model model){
        List<PostResponse> posts = postService.findAllPost();
        model.addAttribute("posts",posts);
        return "post/list";
    }

    @GetMapping("/post/view.do")
    public String showPostView(@RequestParam final Long id, Model model){
        PostResponse post = postService.findPostById(id);
        model.addAttribute("post",post);
        return "post/view";
    }

    @PostMapping("/post/update.do")
    public String updatePost(final PostRequest post){
        postService.updatePost(post);
        return "redirect:/post/list.do";
    }


    @PostMapping("/post/delete.do")
    public String deletePost(@RequestParam final Long id){
        postService.deletePost(id);
        return "redirect:/post/list.do";
    }



}
