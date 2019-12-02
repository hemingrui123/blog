package com.example.demo.service;

import com.example.demo.model.FriendLink;
import com.example.demo.model.Result;

import net.sf.json.JSONArray;

/**
 * 
 * Describe:
 */
public interface FriendLinkService {

    Result addFriendLink(FriendLink friendLink);

    JSONArray getAllFriendLink();

    Result updateFriendLink(FriendLink friendLink, int id);

    Result deleteFriendLink(int id);

    Result getFriendLink();
}
