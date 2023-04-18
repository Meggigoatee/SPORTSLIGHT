package com.sportslight.view.service;

import java.util.List;

import com.sportslight.view.dto.ViewBoardDTO;
import com.sportslight.view.dto.ViewDTO;

public interface ViewService {

	// 동영상 정보 가져오기
	public ViewDTO getVideoService(int videoNum);
	
	// 동영상 한줄 댓글 가져오기
	public List<ViewBoardDTO> getVideoBoardService(int videoNum);
	
	// 동영상 한줄 댓글 개수 가져오기
	public int getVideoBoardCountService(int videoNum);
	
}
