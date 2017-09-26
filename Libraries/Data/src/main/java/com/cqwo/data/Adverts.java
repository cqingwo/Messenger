package com.cqwo.data;

import com.cqwo.core.domain.AdvertInfo;
import com.cqwo.core.domain.AdvertPositionInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by cqnews on 2017/4/11.
 */


//广告表
@Service(value = "AdvertsData")
public class Adverts extends DataService
{


	//region  方法

	/**
	 * 获得广告表数量
	 * @param condition 条件
	 * @return 返回数量
	 **/
	public int GetAdvertCount(String condition) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertCount(condition);
	}

	/**
	 * 创建一条广告表数据
	 * @param advertInfo 广告表模型
	 * @return 返回创建信息
	 **/
	public int CreateAdvert(AdvertInfo advertInfo) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateAdvert(advertInfo);
	}

	/**
	 * 更新一条广告表数据
	 * @param advertInfo 广告表模型
	 **/
	public void UpdateAdvert(AdvertInfo advertInfo) throws IOException {
		getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateAdvert(advertInfo);
	}

	/**
	 * 删除一条广告表数据
	 * @param adid 广告表模型
	 **/
	public void DeleteAdvertByAdId(int  adid) throws IOException {
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteAdvertByAdId(adid);
	}
	/**
	 * 批量删除一批广告表数据
	 **/
	public void DeleteAdvertByAdIdList(String adidList ) throws IOException {
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteAdvertByAdIdList(adidList );
	}

	/**
	 * 获取一条广告表数据
	 * @param adid 广告表模型
	 **/
	public AdvertInfo GetAdvertByAdId(int adid) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertByAdId(adid);
	}




	/**
	 * 获得广告表数据列表
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdvertInfo
	 **/
	public List<AdvertInfo> GetAdvertList(String condition,String sort) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertList(condition,sort);
	}



	/**
	 * 获得广告表数据列表
	 * @param pageSize 每页数
	 * @param pageNumber 当前页数
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdvertInfo
	 **/
	public List<AdvertInfo> GetAdvertList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertList(pageSize,pageNumber,condition,sort);
	}



	//endregion

	//region  广告位置表方法

	/**
	 * 获得广告位置表数量
	 * @param condition 条件
	 * @return 返回数量
	 **/
	public int GetAdvertPositionCount(String condition) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertPositionCount(condition);
	}

	/**
	 * 创建一条广告位置表数据
	 * @param advertpositionInfo 广告位置表模型
	 * @return 返回创建信息
	 **/
	public int CreateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().CreateAdvertPosition(advertpositionInfo);
	}

	/**
	 * 更新一条广告位置表数据
	 * @param advertpositionInfo 广告位置表模型
	 **/
	public void UpdateAdvertPosition(AdvertPositionInfo advertpositionInfo) throws IOException {
		getCwmData().getIrdbsStrategy().getiBaseStrategy().UpdateAdvertPosition(advertpositionInfo);
	}

	/**
	 * 删除一条广告位置表数据
	 * @param adposid 广告位置表模型
	 **/
	public void DeleteAdvertPositionByAdPosId(int  adposid) throws IOException {
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteAdvertPositionByAdPosId(adposid);
	}
	/**
	 * 批量删除一批广告位置表数据
	 **/
	public void DeleteAdvertPositionByAdPosIdList(String adposidList ) throws IOException {
		getCwmData().getIrdbsStrategy().getiBaseStrategy().DeleteAdvertPositionByAdPosIdList(adposidList );
	}

	/**
	 * 获取一条广告位置表数据
	 * @param adposid 广告位置表模型
	 **/
	public AdvertPositionInfo GetAdvertPositionByAdPosId(int adposid) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertPositionByAdPosId(adposid);
	}




	/**
	 * 获得广告位置表数据列表
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdvertPositionInfo
	 **/
	public List<AdvertPositionInfo> GetAdvertPositionList(String condition,String sort) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertPositionList(condition,sort);
	}



	/**
	 * 获得广告位置表数据列表
	 * @param pageSize 每页数
	 * @param pageNumber 当前页数
	 * @param condition 条件
	 * @param sort 排序
	 * @return 返回AdvertPositionInfo
	 **/
	public List<AdvertPositionInfo> GetAdvertPositionList(int pageSize, int pageNumber, String condition, String sort) throws IOException {
		return getCwmData().getIrdbsStrategy().getiBaseStrategy().GetAdvertPositionList(pageSize,pageNumber,condition,sort);
	}



	//endregion
}
