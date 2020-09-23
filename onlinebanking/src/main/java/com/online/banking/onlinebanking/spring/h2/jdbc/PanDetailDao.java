package com.online.banking.onlinebanking.spring.h2.jdbc;
import java.util.List;
import com.online.banking.onlinebanking.beans.PanBean;;

public interface PanDetailDao {
	public PanBean getPan(String pan);

	public int addPan(PanBean panBean);
}
