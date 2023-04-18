package com.sportslight.view.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sportslight.view.dto.ViewBoardDTO;
import com.sportslight.view.dto.ViewDTO;

@Mapper
@Repository
public interface ViewDAO {
	
	// 동영상 정보 가져오기
	public ViewDTO getVideo(int videoNum);
	
	// 동영상 한줄 댓글 가져오기
	public List<ViewBoardDTO> getVideoBoard(int videoNum);
	
	// 동영상 한줄 댓글 개수 가져오기
	public int getVideoBoardCount(int videoNum);
	
	// 동영상 조회시 조회수 1씩 증가
	public void viewCount(int videoNum);

}
