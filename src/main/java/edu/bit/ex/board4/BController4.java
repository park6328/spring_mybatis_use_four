package edu.bit.ex.board4;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.ExternalResources;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.board1.IBDao;


/*
*
1.ù��° ����� ���� �����. ��� sqlSession.getMapper �Լ��� ������� ���� 
2.�����ϰ� ������

3.root~.xml �� 
�Ʒ��� �߰���
	<!-- 	Mapper Interface -->
	<mybatis-spring:scan base-package="edu.bit.mapper"/> 

*/

@Controller
public class BController4 {

	@Inject
	BService4 bservice; //����Ŭ������ ����������
	
	@RequestMapping("/list4")//localhost:8282/ex(���ؽ�Ʈ)/ ���� �ּҸ� �ν��Ͽ� �Ʒ� �޼��带 ������
	public String list(Model model) throws Exception{
		System.out.println("list4()");	
		
		model.addAttribute("list", bservice.selectblist());			
		return "list"; // ���ϰ��� jsp �̸��� ã���༭ �̵�.
		
	
	}
	
	/*
	 * @RequestMapping("/write_view") public String write_view(Model model) {
	 * System.out.println("write_view()");
	 * 
	 * return "write_view"; }
	 * 
	 * @RequestMapping("/content_view") public String
	 * content_view(HttpServletRequest request, Model model){
	 * System.out.println("content_view()");
	 * 
	 * String bid = request.getParameter("bId");
	 * 
	 * IBDao dao = sqlSession.getMapper(IBDao.class);
	 * model.addAttribute("content_view", dao.ContentDao(bid));
	 * 
	 * 
	 * return "content_view"; }
	 * 
	 * @RequestMapping("/delete") public String delete(HttpServletRequest request,
	 * Model model){ System.out.println("delete()");
	 * 
	 * String bId = request.getParameter("bId");
	 * 
	 * IBDao dao = sqlSession.getMapper(IBDao.class);
	 * 
	 * int num = Integer.parseInt(bId);
	 * 
	 * dao.deleteDao(num);
	 * 
	 * 
	 * return "redirect:list"; }
	 * 
	 * @RequestMapping(value="/modify", method=RequestMethod.POST ) public String
	 * modify(BDto bDto, Model model){ System.out.println("modify()");
	 * 
	 * 
	 * IBDao dao = sqlSession.getMapper(IBDao.class); dao.updateDao(bDto);
	 * 
	 * return "redirect:list"; }
	 */
}