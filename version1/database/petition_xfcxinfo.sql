-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: petition
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `xfcxinfo`
--

DROP TABLE IF EXISTS `xfcxinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xfcxinfo` (
  `title` varchar(100) NOT NULL,
  `type` varchar(20) NOT NULL,
  `time` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xfcxinfo`
--

LOCK TABLES `xfcxinfo` WRITE;
/*!40000 ALTER TABLE `xfcxinfo` DISABLE KEYS */;
INSERT INTO `xfcxinfo` VALUES ('党政领导干部选拔任用工作条例》(2019修订)','党内法规',''),('关于依纪依法规范纪检监察信访举报工作的若干意见','党内法规','2005年2月1日'),('档案管理违法违纪行为处分规定','党内法规','2013年2月22日'),('党员领导干部违反规定插手干预工程建设领域行为适用《中国共产党纪律处分条例》若干问题的解释','党内法规',''),('关于加强纪检监察基层信访举报工作的意见','党内法规',''),('机构编制监督检查工作暂行规定','党内法规',''),('中共中央纪律检查委员会、中华人民共和国监察部关于保护检举、控告人的规定','党内法规','1996年1月19日'),('中国共产党纪律处分条例(2018修订)','党内法规','2018年8月26日'),('中国共产党纪律检查机关控告申诉工作条例','党内法规','1993年5月21日'),('工伤保险条例(2010修订)','行政法规','2010年12月20日'),('国有土地上房屋征收与补偿条例','行政法规','2011年1月21日'),('机关事务管理条例','行政法规','2012年6月28日'),('计划生育技术服务管理条例(2004修订)','行政法规',''),('劳动保障监察条例','行政法规','2004年11月1日'),('医疗事故处理条例','行政法规',''),('中华人民共和国道路交通安全法实施条例(2017修订)','行政法规','2017'),('中华人民共和国行政监察法实施条例','行政法规','2004年9月17日'),('中华人民共和国劳动合同法实施条例','行政法规','2008年9月18日'),('中华人民共和国土地管理法实施条例(2014修订)','行政法规','2014年7月29日'),('关于自主择业的军队转业干部安置管理若干问题的意见','行政法规',''),('退伍义务兵安置条例','行政法规',''),('最高人民法院关于《中华人民共和国企业破产法》 施行时尚未审结的企业破产案件适用法律若干问题的规定','司法解释',''),('最高人民法院关于审理人身损害赔偿案件适用法律若干问题的解释','司法解释','2003年12月4日'),('国务院农村税费改革工作小组关于印发《农村税费改革信访工作管理暂行办法》的通知','信访程序','2004年12月16日'),('信访条例（2005）','信访程序','2005年1月10日'),('信访工作责任制实施办法','信访程序','2016年10月24日'),('中共中央办公厅、国务院办公厅印发《关于创新群众工作方法解决信访突出问题的意见》的通知','信访程序','2013年12月20日'),('国家食品药品监督管理局关于进一步加强信访工作的意见','信访程序','2005年7月20日'),('国家信访局关于印发《国家信访局关于进一步加强初信初访办理工作的办法》的通知','信访程序','2014年9月11日'),('信访局印发《关于进一步加强和规范联合接访工作的意见》的通知','信访程序','2015年6月24日'),('国家体育总局关于印发《国家体育总局信访工作办法》的通知','信访程序','2006年3月3日'),('财政部信访工作办法','信访程序','2005年8月22日'),('公安机关信访工作规定','信访程序','2005年8月18日'),('最高人民法院、最高人民检察院、公安部、司法部关于印发《关于依法处理涉法涉诉信访工作衔接配合的规定》的通知','信访程序','2017年11月24日'),('国土资源信访规定(2006 修订)','信访程序','2006年1月4日'),('环境信访办法(2006)','信访程序','2006年6月24日'),('监察部、人力资源和社会保障部、国家信访局关于违反信访工作纪律处分暂行规定','信访程序','2008年6月30日'),('建设部关于印发《建设部信访工作管理办法》的通知','信访程序','2005年11月10日'),('老干部信访工作暂行规定','信访程序','1996年11月6日'),('民政信访工作办法(2011)','信访程序','2011年7月1日'),('人事部办公厅关于印发《人事部信访工作规定》的通知(2005)','信访程序','2005年5月13日'),('司法部关于做好涉法涉诉信访工作的通知','信访程序','2006年7月25日'),('司法行政机关信访工作办法（2018修订）','信访程序','2018年02月09日'),('人民法院涉诉信访案件终结办法','信访程序','2011年5月'),('最高人民法院关于人民法院办理执行信访案件若干问题的意见','信访程序','2016年6月27日'),('最高人民法院关于依法维护人民法院申诉信访秩序的意见','信访程序','2014年12月15日'),('最高人民法院关于印发《人民法院国家司法救助案件办理程序规定（试行）》','信访程序','2019年1月4日'),('最高人民法院执行局关于办理涉执申诉信访案件办理流程规范','信访程序','2018年4月'),('最高人民检察院关于印发《人民检察院信访工作规定》的通知','信访程序','2007年3月26日'),('共青团中央办公厅关于印发《共青团信访工作实施办法》的通知','信访程序','2007年7月3日'),('全国工会实施《信访条例》办法','信访程序',''),('关于健全涉法涉诉信访依法终结制度的意见','信访程序',''),('中共中央纪委关于印发《关于违反信访工作纪律适用＜中国共产党纪律处分条例＞若干问题的解释》的通知','信访程序','2008年7月4日'),('中国保险监督管理委员会关于修改《中国保险监督 管理委员会信访工作办法》的决定(2013)','信访程序','2013年7月4日'),('中央政法委关于建立律师参与化解和代理涉法涉诉 信访案件制度的意见(试行)','信访程序','2015年6月8日'),('重庆市信访条例(2020修订)','信访程序','2020年6月5日'),('中华人民共和国公司法(2018修正)','法律法规','2018年10月26日'),('中华人民共和国票据法(2004修正)','法律法规','2004年08月28日'),('中华人民共和国企业破产法','法律法规','2006年08月27日'),('中华人民共和国证券法(2019修订)','法律法规','2019年12月28日'),('中华人民共和国著作权法(2010 修正)','法律法规','2010年02月26日'),('中华人民共和国著作权法(2020 修正)','法律法规','2020年11月11日'),('中华人民共和国专利法(2008 修正)','法律法规','2008年12月27日'),('中华人民共和国专利法(2020 修正)','法律法规','2020年10月17日'),('中华人民共和国产品质量法(2018修正)','法律法规','2018年12月29日'),('中华人民共和国城乡规划法(2019修正)','法律法规','2019年4月23日'),('中华人民共和国道路交通安全法(2011修正)','法律法规','2011年4月22日'),('中华人民共和国公证法(2017修正)','法律法规','2017年9月1日'),('中华人民共和国国家赔偿法(2012修正)','法律法规','2012年10月26日'),('中华人民共和国行政处罚法(2017修正)','法律法规','2017年9月1日'),('中华人民共和国行政复议法(2017修正)','法律法规','2017年9月1日'),('中华人民共和国行政强制法','法律法规','2011年6月30日'),('中华人民共和国行政诉讼法(2017修正)','法律法规','2017年6月27日'),('中华人民共和国行政许可法(2019修正)','法律法规','2019年4月23日'),('中华人民共和国环境保护法(2014修订)','法律法规','2014年4月24日'),('中华人民共和国建筑法(2019修正)','法律法规','2019年4月23日'),('中华人民共和国人口与计划生育法(2015修正)','法律法规','2015年12月27日'),('中华人民共和国食品安全法(2018修正)','法律法规','2018年12月29日'),('中华人民共和国税收征收管理法(2015修正)','法律法规','2015年4月24日'),('中华人民共和国土地管理法(2019修正)','法律法规','2019年8月26日'),('中华人民共和国药品管理法(2019修订)','法律法规','2019年12月1日'),('中华人民共和国政府采购法(2014修正)','法律法规','2014年8月31日'),('中华人民共和国治安管理处罚法(2012修正)','法律法规','2012年10月26日'),('中华人民共和国安全生产法(2014修正)','法律法规','2014年8月31日'),('中华人民共和国保险法(2015修正)','法律法规','2015年4月 24日'),('中华人民共和国残疾人保障法(2018修正)','法律法规','2018年10月26日'),('中华人民共和国城市房地产管理法(2019修正)','法律法规','2019年8月26日'),('中华人民共和国大气污染防治法(2018修正)','法律法规','2018年10月26日'),('中华人民共和国反家庭暴力法','法律法规','2015年12月27日'),('中华人民共和国妇女权益保障法(2018修正)','法律法规','2018年10月26日'),('中华人民共和国个人所得税法(2018修正)','法律法规','2018年8月31日'),('中华人民共和国耕地占用税法','法律法规','2018年12月29日'),('中华人民共和国广告法(2018修正)','法律法规','2018年10月26日'),('中华人民共和国教育法(2015修正)','法律法规','2015年12月27日'),('中华人民共和国矿产资源法(2009修正)','法律法规','2009年08月27日'),('中华人民共和国劳动法(2018修正)','法律法规','2018年12月29日'),('中华人民共和国劳动合同法(2012修正)','法律法规','2012年12月28日'),('中华人民共和国劳动争议调解仲裁法','法律法规','2007年12月29日'),('中华人民共和国老年人权益保障法(2018修正)','法律法规','2018年12月29日'),('中华人民共和国农村土地承包法(2018修正)','法律法规','2018年12月29日'),('中华人民共和国农村土地承包经营纠纷调解仲裁法','法律法规','2009年6月27日'),('中华人民共和国森林法(2019修订)','法律法规','2019年12月28日'),('中华人民共和国社会保险法(2018修正)','法律法规','2018年12月29日'),('中华人民共和国水法(2016修正)','法律法规','2016年7月2日'),('中华人民共和国水污染防治法(2017修正)','法律法规','2017年6月27日'),('中华人民共和国土壤污染防治法','法律法规','2018年8月31日'),('中华人民共和国未成年人保护法(2012修正)','法律法规','2012年10月26日'),('中华人民共和国未成年人保护法(2020 修订)','法律法规','2020年10月17日'),('中华人民共和国消费者权益保护法(2013修正)','法律法规','2013年10月25日'),('中华人民共和国野生动物保护法(2018修正)','法律法规','2018年10月26日'),('中华人民共和国渔业法(2013修正)','法律法规','2013年12月28日'),('中华人民共和国职业病防治法(2018修正)','法律法规','2018年12月29日'),('中华人民共和国民法典','法律法规','2020年05月28日'),('中华人民共和国民事诉讼法','法律法规','2017年6月27日'),('中华人民共和国仲裁法','法律法规','2017年9月1日'),('中华人民共和国监察法','法律法规','2018年03月20日'),('中华人民共和国宪法','法律法规','2018年03月11日'),('中华人民共和国监狱法','法律法规','2012年10月26日'),('中华人民共和国社区矫正法','法律法规','2019年12月28日'),('中华人民共和国刑法','法律法规','2017年11月04日'),('中华人民共和国刑事诉讼法','法律法规','2018年10月26日'),('安全生产领域违法违纪行为政纪处分暂行规定','部门规章',''),('城乡规划违法违纪行为处分办法(2016修订)','部门规章','2016年'),('道路交通事故处理程序规定(2017修订)','部门规章','2017年'),('行政机关机构编制违法违纪行为政纪处分暂行规定','部门规章','2012年9月11日'),('环境保护违法违纪行为处分暂行规定','部门规章',''),('监察机关参加生产安全事故调查处理的规定','部门规章','2012年11月15日'),('监察机关处理不服行政处分申诉的办法','部门规章','1991年11月30日'),('监察机关调查处理政纪案件办法','部门规章','1991年11月22日'),('事业单位工作人员处分暂行规定','部门规章','2012年8月22日'),('违反规定插手干预工程建设领域行为处分规定','部门规章',''),('违反土地管理规定行为处分办法','部门规章',''),('医疗事故技术鉴定暂行办法','部门规章',''),('中央纪委监察部关于纪检监察机关接待处理集体上访的暂行办法','部门规章','1996年4月24日');
/*!40000 ALTER TABLE `xfcxinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-12 16:46:09