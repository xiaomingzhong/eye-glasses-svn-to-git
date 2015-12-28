package net.shopxx.service;

import net.shopxx.entity.DeliveryCenter;

/**
 * Service接口 - 发货点
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前,您不能将本软件应用于商业用途,否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX3F6674D6C2E7DF7287EF69622E4F46B5
 * ============================================================================
 */

public interface DeliveryCenterService extends BaseService<DeliveryCenter, String> {
	
	/**
	 * 获取默认发货点,若无默认发货点,则获取最先添加的发货点
	 * 
	 */
	public DeliveryCenter getDefaultDeliveryCenter();

}