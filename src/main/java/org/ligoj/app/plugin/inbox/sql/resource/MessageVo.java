package org.ligoj.app.plugin.inbox.sql.resource;

import org.ligoj.app.api.NodeVo;
import org.ligoj.app.iam.SimpleUser;
import org.ligoj.app.plugin.id.resource.ContainerWithScopeVo;
import org.ligoj.app.plugin.inbox.sql.model.Message;
import org.ligoj.app.resource.project.ProjectLightVo;

import lombok.Getter;
import lombok.Setter;

/**
 * A message to target audience and with detailed information from the source.
 */
@Getter
@Setter
public class MessageVo extends Message {

	/**
	 * Optional project targeted by this message.
	 */
	private ProjectLightVo project;

	/**
	 * Optional user details source of this message.
	 */
	private SimpleUser from;

	/**
	 * Optional user targeted by this message.
	 */
	private SimpleUser user;

	/**
	 * Optional node details targeted by this message.
	 */
	private NodeVo node;

	/**
	 * Optional group details targeted by this message.
	 */
	private ContainerWithScopeVo group;

	/**
	 * Optional company details targeted by this message.
	 */
	private ContainerWithScopeVo company;

	/**
	 * Message state. When <code>true</code> this message is new for a specific message.
	 */
	private boolean unread;

}
