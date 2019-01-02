<%@ page language="java" pageEncoding="UTF-8"%>
<div class="head">
	<div class="menu">
		<div class="logo">
			<a href="page/home">
				<img src="/imgs/logo-header.png" />
			</a>
		</div>
		<ul class="item-box">
			<li class="item" onclick="redirect('home')">
				<div class="text"><a href="javascript:void(0)" onclick="redirect('home')">首页</a></div>
				<div class="spot" id="spot-home"></div>
			</li>
			<li class="item" onclick="redirect('product')">
				<div class="text"><a href="javascript:void(0)" onclick="redirect('product')">聊产品</a></div>
				<div class="spot" id="spot-product"></div>
			</li>
			<li class="item" onclick="redirect('reading')">
				<div class="text"><a href="javascript:void(0)" onclick="redirect('reading')">读书汇</a></div>
				<div class="spot" id="spot-reading"></div>
			</li>
			<li class="item" onclick="redirect('tools')">
				<div class="text"><a href="javascript:void(0)" onclick="redirect('tools')">工具库</a></div>
				<div class="spot" id="spot-tools"></div>
			</li>
		</ul>
	</div>
</div>