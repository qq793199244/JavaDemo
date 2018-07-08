package com.imooc.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

//计算执行Action花费的时间
public class TimerInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//1.执行Action之前
		long start = System.currentTimeMillis();
		//2.执行下一个拦截器，如果已经是最后一个拦截器，则调用目标Action
		String result = invocation.invoke();
		//3.执行Action之后，统计时间
		long end = System.currentTimeMillis();
		
		System.out.println("执行Action花费的时间为："+(end-start)+"ms");
		return result;
	}

}
