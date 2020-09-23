package com.online.banking.onlinebanking.service;
import java.util.List;

import com.online.banking.onlinebanking.beans.PanBean;

public interface PanDetailService{
	public PanBean getPan(String pan);
	public int addPan(PanBean panBean);
}





