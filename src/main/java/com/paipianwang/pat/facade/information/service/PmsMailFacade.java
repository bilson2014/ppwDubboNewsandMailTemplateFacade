package com.paipianwang.pat.facade.information.service;

import com.paipianwang.pat.facade.information.entity.PmsMail;

/**
 * 邮件服务接口
 * @version 1.0
 */
public interface PmsMailFacade {

	public PmsMail getTemplateByType(final String mailType);

	
}
