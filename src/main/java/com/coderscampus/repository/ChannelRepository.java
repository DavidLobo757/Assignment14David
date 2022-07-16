package com.coderscampus.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.coderscampus.domain.Channel;

public class ChannelRepository {
	private List<Channel> channels = new ArrayList<>();
	
	public ChannelRepository() {
		Channel general = new Channel();
		general.setChannelId(1L);
	}
	
	public Optional<Channel> findById (Long channelId) {
		return channels.stream()
			           .filter(channel -> channel.getChannelId().equals(channelId))
			           .findAny();
	}
	
	public List<Channel> findAll() {
		return channels;
	}
}
