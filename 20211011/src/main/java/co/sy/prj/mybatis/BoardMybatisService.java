package co.sy.prj.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.sy.prj.board.service.BoardService;
import co.sy.prj.board.service.BoardVO;

public class BoardMybatisService implements BoardService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	// SQL Session을 열고... 음... 끝이네... 음...
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class); 
			
	@Override
	public List<BoardVO> boardSelectList() {
		// TODO Auto-generated method stub
		return map.boardSelectList();
	}

	@Override
	public BoardVO boardSelect(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardSelect(board);
	}

	@Override
	public int boardInsert(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardInsert(board);
	}

	@Override
	public int boardUpdate(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardUpdate(board);
	}

	@Override
	public int boardDelete(BoardVO board) {
		// TODO Auto-generated method stub
		return map.boardDelete(board);
	}

}
