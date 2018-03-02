package com.practice.designpattern.adapter;

public class VoltAdapterImpl extends VoltGeneralAdapter implements VoltAdapter
{
	@Override
	public String getTVVolt() {
		// TODO Auto-generated method stub
		int volt = getVolts().getVolt() - 0; 
		return "Tv Volt is "+volt;
	}

	@Override
	public String getMobileVolt() {
		int volt = getVolts().getVolt() - 75; 
		return "Mobile Volt is "+volt;
	}

	@Override
	public String getPCVolt() {
		int volt = getVolts().getVolt() - 100; 
		return "PC Volt is "+volt;
	}

	@Override
	public String getFanVolt() {
		int volt = getVolts().getVolt() - 150; 
		return "Fan Volt is "+volt;
	}

}
