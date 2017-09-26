package com.cqwo.data;

import com.cqwo.core.domain.FilterWordInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//筛选词表
@Service(value = "FilterWordsData")
public class FilterWords extends DataService
{
	

	//region  筛选词表方法
	
	/**
	* 获得筛选词表数量
	* @param condition 条件 
	* @return 返回数量
	**/
	public int GetFilterWordCount(String condition) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFilterWordCount(condition);
	}

	/**
	* 创建一条筛选词表数据
	* @param filterwordInfo 筛选词表模型
	* @return 返回创建信息
	**/	 
	public int CreateFilterWord(FilterWordInfo filterwordInfo) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateFilterWord(filterwordInfo);
	}

	/**
	* 更新一条筛选词表数据
	* @param filterwordInfo 筛选词表模型
	**/
	public void UpdateFilterWord(FilterWordInfo filterwordInfo) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateFilterWord(filterwordInfo);
	}

	/**
	* 删除一条筛选词表数据
	* @param id 筛选词表模型
	**/
	public void DeleteFilterWordById(int  id) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteFilterWordById(id);
	}
		/**
	* 批量删除一批筛选词表数据
	**/
	public void DeleteFilterWordByIdList(String idList ) throws IOException { 
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteFilterWordByIdList(idList );
	}
	
	/**
	* 获取一条筛选词表数据
	* @param id 筛选词表模型
	**/
	 public FilterWordInfo GetFilterWordById(int id) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFilterWordById(id);
	}



	
	/**
	* 获得筛选词表数据列表
	* @param condition 条件
	* @param sort 排序
	* @return 返回FilterWordInfo
	**/
	public List<FilterWordInfo> GetFilterWordList(String condition,String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFilterWordList(condition,sort);
	}
	

			
	/**
	* 获得筛选词表数据列表
	* @param pageSize 每页数
	* @param pageNumber 当前页数
	* @param condition 条件
	* @param sort 排序
	* @return 返回FilterWordInfo
	**/
	public List<FilterWordInfo> GetFilterWordList(int pageSize, int pageNumber, String condition, String sort) throws IOException { 
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetFilterWordList(pageSize,pageNumber,condition,sort);
	}
	


	//endregion
   
}
