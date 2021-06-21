package ex4.car;

import java.util.ArrayList;

import ex4.base.Base;
import ex4.common.DataUtil;

public class CarImpl extends Base implements Car{
	String carData;
	CarDAO carDAO=new CarDAOImpl();
	
	
	//차의 정보를 조회하는 메서드
	public ArrayList<CarVo> listCarInfo(CarVo vo) throws Exception{
		ArrayList<CarVo> carList=null;
		
		try {
			carList=carDAO.listCarInfo(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carList;
	}
	
	//새 차의 정보를 등록하는 메서드
	public void regCarInfo(CarVo vo)  throws Exception{
		carDAO.regCarInfo(vo);
	}
	
	// 차 정보를 수정하는 메서드
	public void modCarInfo(CarVo vo) throws Exception{
		// 구현해 보세요.
	}
	
	//차 정보를 삭제하는 메서드
	public void delCarInfo(CarVo vo) throws Exception{
		//구현해 보세요.
	}
	

}
