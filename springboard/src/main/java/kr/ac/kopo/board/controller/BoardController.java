package kr.ac.kopo.board.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public void writeGet(Model model) {
//		return "board/write";// 없어도 동작함

		BoardVO boardVO1 = new BoardVO();
		boardVO1.setTitle("제목");

		model.addAttribute("boardVO1", boardVO1);
	}

//	글쓰기 process
	@PostMapping("board/write")
	public String writePost(@Valid @ModelAttribute("boardVO1") BoardVO board, BindingResult result) {

//		boardService.insertBoard(board);
//		System.out.println(result);
		if (result.hasErrors()) {
			// error가 존재하는 경우(null이 있는 경우)
			//board/write.jsp
			return "board/write";
		} else {
			//insert DB -> 전체게시글로 redirect
			boardService.insertBoard(board);
			return "redirect:/board";
		}
	}
}