package fedata.gba;

public interface GBAFECharacterData extends GBAFEModifiableData {
	
	public Boolean isClassRestricted();
	
	// Info
	
	public int getNameIndex();
	public int getDescriptionIndex();
	
	public int getID();
	
	public int getClassID();
	public void setClassID(int classID);
	
	// Growths
	
	public int getHPGrowth();
	public void setHPGrowth(int hpGrowth);
	
	public int getSTRGrowth();
	public void setSTRGrowth(int strGrowth);
	
	public int getSKLGrowth();
	public void setSKLGrowth(int sklGrowth);
	
	public int getSPDGrowth();
	public void setSPDGrowth(int spdGrowth);
	
	public int getDEFGrowth();
	public void setDEFGrowth(int defGrowth);
	
	public int getRESGrowth();
	public void setRESGrowth(int resGrowth);
	
	public int getLCKGrowth();
	public void setLCKGrowth(int lckGrowth);
	
	// Bases
	
	public int getBaseHP();
	public void setBaseHP(int baseHP);
	
	public int getBaseSTR();
	public void setBaseSTR(int baseSTR);
	
	public int getBaseSKL();
	public void setBaseSKL(int baseSKL);
	
	public int getBaseSPD();
	public void setBaseSPD(int baseSPD);
	
	public int getBaseDEF();
	public void setBaseDEF(int baseDEF);
	
	public int getBaseRES();
	public void setBaseRES(int baseRES);
	
	public int getBaseLCK();
	public void setBaseLCK(int baseLCK);
	
	// Weapon Ranks
	
	public int getSwordRank();
	public void setSwordRank(int rank);
	
	public int getLanceRank();
	public void setLanceRank(int rank);
	
	public int getAxeRank();
	public void setAxeRank(int rank);
	
	public int getBowRank();
	public void setBowRank(int rank);
	
	public int getAnimaRank();
	public void setAnimaRank(int rank);
	
	public int getDarkRank();
	public void setDarkRank(int rank);
	
	public int getLightRank();
	public void setLightRank(int rank);
	
	public int getStaffRank();
	public void setStaffRank(int rank);
	
	// Miscellaneous
	
	public int getConstitution();
	public void setConstitution(int newCON);
	public int getAffinityValue();
	public void setAffinityValue(int newAffinity);
	public String getAffinityName();
	
	public void prepareForClassRandomization();
	
	public void setIsLord();
}