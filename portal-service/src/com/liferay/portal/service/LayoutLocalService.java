/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.service;

/**
 * <a href="LayoutLocalService.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be overwritten
 * the next time is generated.
 * </p>
 *
 * <p>
 * This interface defines the service. The default implementation is <code>com.liferay.portal.service.impl.LayoutLocalServiceImpl</code>.
 * Modify methods in that class and rerun ServiceBuilder to populate this class
 * and all other generated classes.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed
 * from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portal.service.LayoutServiceFactory
 * @see com.liferay.portal.service.LayoutServiceUtil
 *
 */
public interface LayoutLocalService {
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException;

	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int begin, int end) throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.Layout addLayout(long groupId,
		java.lang.String userId, boolean privateLayout,
		java.lang.String parentLayoutId, java.lang.String name,
		java.lang.String title, java.lang.String type, boolean hidden,
		java.lang.String friendlyURL)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public void deleteLayout(java.lang.String layoutId, java.lang.String ownerId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public void deleteLayout(com.liferay.portal.model.Layout layout,
		boolean updateLayoutSet)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public void deleteLayouts(java.lang.String ownerId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public byte[] exportLayouts(java.lang.String ownerId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout getFriendlyURLLayout(
		java.lang.String ownerId, java.lang.String friendlyURL)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout getLayout(java.lang.String plid)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout getLayout(
		java.lang.String layoutId, java.lang.String ownerId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public java.util.List getLayouts(java.lang.String ownerId)
		throws com.liferay.portal.SystemException;

	public java.util.List getLayouts(java.lang.String ownerId,
		java.lang.String parentLayoutId)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.model.LayoutReference[] getLayouts(
		java.lang.String companyId, java.lang.String portletId,
		java.lang.String prefsKey, java.lang.String prefsValue)
		throws com.liferay.portal.SystemException;

	public void importLayouts(java.lang.String userId,
		java.lang.String ownerId, java.io.File file)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public void importLayouts(java.lang.String userId,
		java.lang.String ownerId, java.io.InputStream is)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public void setLayouts(java.lang.String ownerId,
		java.lang.String parentLayoutId, java.lang.String[] layoutIds)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout updateLayout(
		java.lang.String layoutId, java.lang.String ownerId,
		java.lang.String parentLayoutId, java.lang.String name,
		java.lang.String title, java.lang.String languageId,
		java.lang.String type, boolean hidden, java.lang.String friendlyURL)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout updateLayout(
		java.lang.String layoutId, java.lang.String ownerId,
		java.lang.String parentLayoutId, java.lang.String name,
		java.lang.String title, java.lang.String languageId,
		java.lang.String type, boolean hidden, java.lang.String friendlyURL,
		java.lang.Boolean iconImage, byte[] iconBytes)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout updateLayout(
		java.lang.String layoutId, java.lang.String ownerId,
		java.lang.String typeSettings)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout updateLookAndFeel(
		java.lang.String layoutId, java.lang.String ownerId,
		java.lang.String themeId, java.lang.String colorSchemeId,
		java.lang.String css)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public com.liferay.portal.model.Layout updateName(
		java.lang.String layoutId, java.lang.String ownerId,
		java.lang.String name, java.lang.String languageId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;
}