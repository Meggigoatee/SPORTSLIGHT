package com.sportslight.view.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sportslight.view.service.ViewService;

import lombok.NoArgsConstructor;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@NoArgsConstructor
public class ViewController {
	
	@Autowired
	private ViewService viewService;
	
	// 동영상 세부 페이지 호출
	@GetMapping("/view/{videoNum}")
	public Map<String, Object> viewExecute(@PathVariable("videoNum") int videoNum) {
		Map<String, Object> map = new HashMap<>();
		
		// 동영상 정보
		map.put("video", viewService.getVideoService(videoNum));
		// 한줄 댓글 정보
		map.put("videoBoard", viewService.getVideoBoardService(videoNum));
		
		// map으로 return
		return map;
	}
	
	// 한줄 글쓰기 호출
	

}
