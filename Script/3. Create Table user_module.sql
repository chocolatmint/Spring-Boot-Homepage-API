USE [HomepageAPI]
GO

/****** Object:  Table [dbo].[user_module]    Script Date: 24/05/2019 22:07:38 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[user_module](
	[id_user_module] [int] IDENTITY(1,1) NOT NULL,
	[module_order] [int] NOT NULL,
	[id_module] [int] NOT NULL,
	[id_user] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_user_module] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

