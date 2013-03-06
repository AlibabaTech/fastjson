package com.alibaba.json.bvt.util;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class CloneTest_0 extends TestCase {
	public void test_0() throws Exception  {
		JSONObject o = new JSONObject();
		o.put("a", new JSONArray());
		
		JSONObject o1 = o.clone();
		
		Assert.assertEquals(o, o1);
		Assert.assertNotSame(o, o1);
		
		Assert.assertEquals(o.get("a"), o1.get("a"));
		Assert.assertNotSame(o.get("a"), o1.get("a"));
	}
}
