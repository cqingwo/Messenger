package com.cqwo.web.framework.controller;

import com.cqwo.web.framework.PromptModel;
import com.cqwo.web.framework.workcontext.BaseWorkContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class BaseController {


	protected BaseWorkContext workContext;


	public BaseController(){
		System.out.println("BaseController");
	}
	/**
	 * 视图封装
	 * 
	 * @return 返回视图
	 */
	public ModelAndView View() {
		// TODO Auto-generated method stub

		ModelAndView view = new ModelAndView();
		view.addObject("WorkContext",workContext);

		return view;
	}

	/**
	 * 视图封装
	 * 
	 * @param model
	 *            model实体类
	 * @return 返回视图
	 */
	public ModelAndView View(Object model) {
		// TODO Auto-generated method stub

		ModelAndView view = new ModelAndView();

		view.addObject("Model", model);
		view.addObject("WorkContext",workContext);

		return view;
	}

	/**
	 * 视图封装
	 * 
	 * @param viewName
	 *            视图名
	 * @return 返回视图
	 */
	public ModelAndView View(String viewName) {
		// TODO Auto-generated method stub

		ModelAndView view = new ModelAndView(viewName);
		view.addObject("WorkContext",workContext);

		return view;
	}

	/**
	 * 视图封装
	 * 
	 * @param viewName
	 *            视图名
	 * @param model
	 *            model实体类
	 * @return 返回视图
	 */
	public ModelAndView View(String viewName, Object model) {

		ModelAndView view = new ModelAndView(viewName);
		view.addObject("Model", model);
		view.addObject("WorkContext",workContext);

		return view;
	}

	/**
	 * 视图封装
	 * @param modelMap
	 * 			MAP
	 * @return
	 */
	public ModelAndView View(Map<String,?> modelMap){

		ModelAndView view = new ModelAndView();
		view.addObject("Model",modelMap);

		return view;
	}


	/**
	 * 视图封装
	 * @param viewName
	 * 			视图名
	 * @param modelMap
	 * 			MAP
	 * @return
	 */
	public ModelAndView View(String viewName, Map<String, ?> modelMap){

		ModelAndView view = new ModelAndView(viewName);

		view.addObject("Model",modelMap);
		view.addObject("WorkContext",workContext);

		return view;
	}

	/**
	 * 提示信息视图
	 * @param message 提示信息
	 * @return
	 */
	protected ModelAndView PromptView(String message){

		return View("prompt",new PromptModel(message));
	}


	/**
	 * 提示信息视图
	 * @param backUrl 返回地址
	 * @param message 提示信息
	 * @return
	 */
	protected ModelAndView PromptView(String backUrl, String message)
	{
		return View("prompt", new PromptModel(message,backUrl));
	}

	/**
	 * 提示信息视图
	 * @param backUrl 返回地址
	 * @param message 提示信息
	 * @param isAutoBack 是否自动返回
	 * @return
	 */
	protected ModelAndView PromptView(String backUrl, String message, Boolean isAutoBack)
	{
		return View("prompt", new PromptModel(message,backUrl, isAutoBack));
	}

	/**
	 * 提示信息视图
	 * @param backUrl 返回地址
	 * @param message 提示信息
	 * @param countdowntime 倒计时时间
	 * @return
	 */
	protected ModelAndView PromptView(String backUrl, String message, int countdowntime)
	{
		return View("prompt", new PromptModel( message,backUrl,  countdowntime) );
	}

	/**
	 * 提示信息视图
	 * @param backUrl 返回地址
	 * @param message 消息
	 * @param countdownmodel 计数模型
	 * @param countdowntime  倒计时时间
	 * @param isshowbacklink 是否显示返回地址
	 * @param isautoback 是否自动返回
	 * @return
	 */
	protected ModelAndView PromptView(String backUrl, String message,int countdownmodel, int countdowntime, boolean isshowbacklink,boolean isautoback)
	{
		return View("prompt", new PromptModel( message, backUrl,  countdownmodel,  countdowntime,  isshowbacklink, isautoback));
	}




}
