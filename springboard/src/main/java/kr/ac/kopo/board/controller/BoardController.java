package kr.ac.kopo.board.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	// localhost:8080/springboard/board
	@RequestMapping("/board")
	public String allboard(HttpServletRequest request) {
		List<BoardVO> boardlist = new ArrayList<>();
//		System.out.println("hahahah");
		boardlist = boardService.getAllBoard();
		request.setAttribute("boardlist", boardlist);

		// WEN_INF/jsp/board/list.jsp
		return "board/list";
	}

	// 상세게시글 조회
	@RequestMapping("/board/detail")
//		String boardNo = request.getParameter("boardNo");
	public String detail(@RequestParam("boardNo") int no, Model model) {

		BoardVO board = boardService.getOneBoard(no);
		// 모델이라는 영역에 붙이는 건가?
		model.addAttribute("board", board);
		// WEB-INF/jsp/board/detail.jsp
		return "board/detail";
	}

	// 상세게시글 조회 버젼2
	@RequestMapping("/board/detail/{boardNo}")
//		String boardNo = request.getParameter("boardNo");
	public String detail2(@PathVariable("boardNo") int no, Model model) {

		BoardVO board = boardService.getOneBoard(no);
		// 모델이라는 영역에 붙이는 건가?
		model.addAttribute("board", board);
		// WEB-INF/jsp/board/detail.jsp
		return "board/detail";
	}

//	새글쓰기
	@GetMapping("/board/write")
	public void writeGet() {
//		return "board/write";// 없어도 동작함
	}

//	글쓰기 process
	@PostMapping("board/write")
	public String writePost(BoardVO board) {
		
		
		
		boardService.insertBoard(board);
		return "redirect:/board";
	}
}