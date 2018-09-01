CREATE TABLE `inter_area_ctrip` (
	`id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
	`user_name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '用户名',
	`phone` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '电话号',
	`birthday`
	`created_ts` TIMESTAMP NOT NULL DEFAULT  '1980-01-01 00:00:00' COMMENT '创建时间',
	`updated_ts` TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',

	PRIMARY KEY (id),
	UNIQUE KEY `uniq_user_name` (`user_name`),
	KEY `idx_ename` (`ename`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '用户表';