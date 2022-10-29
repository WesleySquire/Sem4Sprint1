package data;

import com.keyin.main.Member;
import com.keyin.main.Tournaments;

import java.util.ArrayList;
import java.util.List;

//Creates a fake database
public class Database {
    public List<Tournaments> getAllTourn() {
        return new ArrayList<Tournaments>();
    }

    public List<Member> getAllMember() {
        return new ArrayList<Member>();
    }
}
