package fr.groupez.api.command.commands;

import fr.groupez.api.command.VCommand;
import fr.groupez.api.zcore.ZPlugin;
import fr.groupez.api.zcore.enums.Message;
import fr.groupez.api.zcore.enums.Permission;
import fr.groupez.api.zcore.utils.commands.CommandType;

public class CommandTemplateReload extends VCommand {

	public CommandTemplateReload(ZPlugin plugin) {
		super(plugin);
		this.setPermission(Permission.EXAMPLE_PERMISSION_RELOAD);
		this.addSubCommand("reload", "rl");
		this.setDescription(Message.DESCRIPTION_RELOAD);
	}

	@Override
	protected CommandType perform(ZPlugin plugin) {
		
		plugin.reloadFiles();
		message(sender, Message.RELOAD);
		
		return CommandType.SUCCESS;
	}

}
