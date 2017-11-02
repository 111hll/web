package pers.husen.web.dao;

import java.util.ArrayList;

import pers.husen.web.bean.vo.CodeLibraryVo;

/**
 * @author 何明胜
 *
 * 2017年9月28日
 */
public interface CodeLibraryDao {
	/**
	 * 查询代码库数量
	 * 
	 * @return
	 */
	public int queryCodeTotalCount();
	
	/**
	 * 查询某一页的代码库
	 * 
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	public ArrayList<CodeLibraryVo> queryCodeLibraryPerPage(int pageSize, int pageNo);
	
	/**
	 * 根据Id查询单独一处代码
	 * @param codeId
	 * @return
	 */
	public CodeLibraryVo queryPerCodeById(int codeId);
	
	/**
	 * 插入新纪录到代码库，返回id
	 * 
	 * @param cVo
	 * @return
	 */
	public int insertCodeLibrary(CodeLibraryVo cVo);
	
	/**
	 * 根据id更新代码库代码阅读次数
	 * @param codeId
	 * @return
	 */
	public int updateCodeReadById(int codeId);
}