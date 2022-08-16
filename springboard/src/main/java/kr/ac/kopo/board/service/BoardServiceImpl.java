package kr.ac.kopo.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	//인터페이스로 쓸 예정
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getAllBoard() {
		
		List<BoardVO> list = new ArrayList<>();
		list = boardDAO.selectAll();
//		System.out.println(list);
		return list;
	}
	
	@Override
	public BoardVO getOneBoard(int boardNo) {
		BoardVO board = new BoardVO();
		board = boardDAO.selectByNo(boardNo);
//		System.out.println(board);
		return board;
	}

	@Override
	public void insertBoard(BoardVO board) {
		boardDAO.insertBoard(board);
		
	}

}
